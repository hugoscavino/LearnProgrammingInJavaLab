package com.learnprogramminginjava.operators;
/************************************************************************************
 * Copyright © 2024 LearnProgrammingInJava.com
 * Licensed under the MIT License (the "License"); you may not use this file except
 * in compliance with the License. You may get a copy of the License at
 *     <a href="https://opensource.org/licenses/MIT">MIT License</a>
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************/
class Invoice{
    int invoiceId;
}

public class MethodAssignment {

    static void processInvoice(Invoice i) {
        i.invoiceId = i.invoiceId + 100;
        // What do you expect here?
        System.out.println(i.invoiceId);
    }
    static public void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.invoiceId = 100;

        processInvoice(invoice);
        // What do you expect here after sending
        // the invoice to the processInvoice method
        // 100 or 200?
        System.out.println(invoice.invoiceId);
    }

}
