/*
package com.testOTS.demo.demo.service;

import com.testOTS.demo.demo.dao.PostInvoiceRepository;
import com.testOTS.demo.demo.dto.PostInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostInvoiceServiceImpl implements PostInvoiceService{

        private PostInvoiceRepository postInvoiceRepository;

        @Autowired
        public PostInvoiceServiceImpl(PostInvoiceRepository postInvoiceRepository) {
            this.postInvoiceRepository = postInvoiceRepository;
        }

    @Override
    public List<PostInvoice> findAll() {
        return postInvoiceRepository.findAll();
    }

    @Override
    public PostInvoice findById(long theId) {
        Optional<PostInvoice> result = postInvoiceRepository.findById(theId);

        PostInvoice postInvoice = null;

        if(result.isPresent()) {
            postInvoice = result.get();
        }
        else {
            throw new RuntimeException("Did not found that Id"+ theId);
        }

        return postInvoice;
    }



    @Override
    public void save(PostInvoice postInvoice) {
        postInvoiceRepository.save(postInvoice);
    }

    @Override
    public void deleteById(long theId) {
        postInvoiceRepository.deleteById(theId);
    }


}
*/
