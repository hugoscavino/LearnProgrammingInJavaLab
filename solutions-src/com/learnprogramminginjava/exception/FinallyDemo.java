package com.learnprogramminginjava.exception;

public class FinallyDemo {

    HardwareResource hw = null;

    void startAllDevices() throws Exception {

        try {
            hw = new HardwareResource();
            hw.start();
        } catch (Exception e) {
            throw new Exception("Hardware Device Failed" + e);
        } finally {

            if (hw != null){
                System.out.println("Attempting to stop hardware");
                // What if stop throws an Exception!
                // This code style is madness!
                try {
                    hw.stop();
                    System.out.println("Stopped hardware");
                }
                catch (Exception e) {
                    System.out.println("Hardware Failure to Stop");
                }

            }

        }

    }
    void startAllDevicesExceptionGobbled() throws Exception {

        try {
            hw = new HardwareResource();
            hw.start();
        }
        finally {
          hw.stop();
            System.out.println("Stopped hardware");
        }

    }

    void startAllDevicesWithResources() throws Exception {

        try (CloseableHardwareResource hw = new CloseableHardwareResource()) {
            hw.start();
        }
        catch (Exception e) {
            throw new Exception("Hardware Device Failed to start" + e);
        }
        // no need for the finally!
    }

    void startAllDevicesWithResourcesJdk9() throws Exception {
        CloseableHardwareResource hw = new CloseableHardwareResource();
        AnotherCloseableHardwareResource ahw = new AnotherCloseableHardwareResource();
        try (hw ; ahw) {
            hw.start();
        }
        catch (Exception e) {
            throw new Exception("Hardware Device Failed to start" + e);
        }
        // no need for the 'finally' clause!
    }

    public static void main(String[] args) throws Exception {
        FinallyDemo fd = new FinallyDemo();
        fd.startAllDevices();

        // Exception all gobbled up!
        fd.startAllDevices();

        fd.startAllDevicesWithResources();
    }
}
