package sample.com.Controler;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.com.objects.Company;

@RestController
@RequestMapping("/company")
public class Contrller {

	HashMap<String,Company> hmap=new LinkedHashMap<String, Company>();
	
	@PostMapping("/save")
	public ResponseEntity<Company> save(@RequestBody Company company) {
		
            hmap.put(company.getName(), company);
            
            return ResponseEntity.ok(company);
          
	}
	
	@PutMapping("/update")
	public ResponseEntity<Company> update(@RequestBody Company company) {
		
            hmap.put(company.getName(), company);
            
            return ResponseEntity.ok(company);
       
	}
	
	@PutMapping("/view")
	public ResponseEntity<Company> update(@RequestBody String name) {
		
            name=name.replaceAll("\"", "");
            
                     if (hmap.containsKey(name)) {
                    	 return ResponseEntity.ok(hmap.get(name));
                     }
                     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Company());
       
	}
	
	@GetMapping("/viewall")
	public ResponseEntity<List< Company>> viewall() {
		
            List<Company> list=hmap.entrySet().stream().map((k)->k.getValue()).toList();
            
            return ResponseEntity.ok(list);
       
	}
	
	
}
