package ie.atu.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {
    @Autowired
    private SupplierServiceClient supplierServiceClient;

    @GetMapping("/suppliers/{supplierId}")
    public String getSupplierDetails(@PathVariable String supplierId) {
        Supplier supplier = supplierServiceClient.getSupplierDetails(supplierId);
        if (supplier != null) {
            return "Supplier details: Supplier ID - " + supplier.getSupplierId() + ", Supplier Name - " + supplier.getSupplierName();
        } else {
            return "Supplier details not found for ID - " + supplierId;
        }
    }
}
