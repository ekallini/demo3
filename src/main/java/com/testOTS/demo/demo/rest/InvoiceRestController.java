package com.testOTS.demo.demo.rest;

import com.testOTS.demo.demo.entity.Invoice;
import com.testOTS.demo.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class InvoiceRestController {

    private InvoiceService invoiceService;

    @Autowired
    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @GetMapping("/invoices/{invoiceId}")
    public Invoice getInvoice(@PathVariable long invoiceId) {

        Invoice invoice = invoiceService.findById(invoiceId);

        if(invoice == null) {
            throw new RuntimeException("Invoice Id not found"+ invoiceId);
        }

        return invoice;
    }

    @PostMapping("/invoices")
    public Invoice addInvoice(@RequestBody Invoice invoice) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        invoice.setId(0);

        invoiceService.save(invoice);

        return invoice;
    }

    // add mapping for PUT /invoices - update existing invoices

    @PutMapping("/invoices")
    public Invoice updateInvoice(@RequestBody Invoice invoice) {

        invoiceService.save(invoice);

        return invoice;
    }

    // add mapping for DELETE /invoices/{invoiceId} - delete invoice

    @DeleteMapping("/invoices/{invoiceId}")
    public String deleteInvoice(@PathVariable long invoiceId) {

        Invoice invoice = invoiceService.findById(invoiceId);

        // throw exception if null

        if (invoice == null) {
            throw new RuntimeException("Invoice id not found - " +invoiceId);
        }

        invoiceService.deleteById(invoiceId);

        return "Deleted invoice id - " + invoiceId;
    }
}
