/*
package com.testOTS.demo.demo.rest;

import com.testOTS.demo.demo.dto.PostInvoice;

import com.testOTS.demo.demo.service.PostInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PostInvoiceRestController {
    private PostInvoiceService postInvoiceService;

    @Autowired
    public PostInvoiceRestController(PostInvoiceService postInvoiceService) {
        this.postInvoiceService = postInvoiceService;
    }

    @GetMapping("/postInvoices")
    public List<PostInvoice> findAll() {
        return postInvoiceService.findAll();
    }

    @GetMapping("/postInvoices/{postInvoiceId}")
    public PostInvoice getPostInvoice(@PathVariable long postInvoiceId) {

        PostInvoice postInvoice = postInvoiceService.findById(postInvoiceId);

        if(postInvoice == null) {
            throw new RuntimeException("Invoice Id not found"+ postInvoiceId);
        }

        return postInvoice;
    }

    @PostMapping("/postInvoices")
    public PostInvoice addPostInvoice(@RequestBody PostInvoice postInvoice) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        postInvoice.setId(0);

        postInvoiceService.save(postInvoice);

        return postInvoice;
    }

    // add mapping for PUT /invoices - update existing invoices

    @PutMapping("/postInvoices")
    public PostInvoice updatePostInvoice(@RequestBody PostInvoice postInvoice) {

        postInvoiceService.save(postInvoice);

        return postInvoice;
    }

    // add mapping for DELETE /invoices/{invoiceId} - delete invoice

    @DeleteMapping("/postInvoices/{postInvoiceId}")
    public String deletePostInvoice(@PathVariable long postInvoiceId) {

        PostInvoice postInvoice = postInvoiceService.findById(postInvoiceId);

        // throw exception if null

        if (postInvoice == null) {
            throw new RuntimeException("Invoice id not found - " +postInvoiceId);
        }

        postInvoiceService.deleteById(postInvoiceId);

        return "Deleted invoice id - " + postInvoiceId;
    }
}
*/
