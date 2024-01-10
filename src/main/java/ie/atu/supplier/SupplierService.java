package ie.atu.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SupplierService {
    @Autowired
    private SupplierServiceClient supplierServiceClient; // Feign client for communication

    // Retrieve supplier details by ID using Feign client
    public Supplier getSupplierById(String supplierId) {
        return supplierServiceClient.getSupplierDetails(supplierId);
    }
}
