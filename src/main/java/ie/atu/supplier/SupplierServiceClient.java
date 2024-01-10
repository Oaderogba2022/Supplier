package ie.atu.supplier;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "supplier-service", url = "http://localhost:8082")
public interface SupplierServiceClient {
    @GetMapping("/suppliers/{supplierId}")
    Supplier getSupplierDetails(@PathVariable String supplierId);
}
