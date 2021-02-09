package com.carrenatal.demo.controller;
import java.util.List;
import java.util.Map;

import com.carrenatal.demo.dto.CarDTO;
import com.carrenatal.demo.dto.CustomerDTO;
import com.carrenatal.demo.model.Customer;
import com.carrenatal.demo.service.CarService;
import com.carrenatal.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegistrationController {

    @Autowired
    private CarService carService;

    private CustomerService customerService;

    @GetMapping("/registration")
    public String reg(Map<String, Object> model) {
        model.put("car", new CarDTO());
        return "Registration";
    }

    @PostMapping("/home")
    public String createCar(@ModelAttribute("car") CarDTO empDto) {
        carService.createOrUpdateCar(empDto);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listOfCar(Model model) {
        List<CarDTO> carList = carService.getAllCar();
        model.addAttribute("empList", carList);
        return "carList";
    }

    @PostMapping("/delete")
    public String deleteCar(@RequestParam("id") String id) {
        carService.deleteCar(Long.parseLong(id));
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String editCar(@RequestParam("id") String id, Map<String, Object> model) {
        CarDTO empDTO = carService.editCar(Long.parseLong(id));
        model.put("car", empDTO);
        return "Registration";
    }
    @GetMapping("/rezervation")
    public String rezervationCustomer(Map<String, Object> model) {
        model.put("customer", new CustomerDTO());
        return "Rezervation";
    }
}

//
//package com.carrenatal.demo.controller;
//        import java.util.List;
//        import java.util.Map;
//
//        import com.carrenatal.demo.dto.CarDTO;
//        import com.carrenatal.demo.service.CarService;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.GetMapping;
//        import org.springframework.web.bind.annotation.ModelAttribute;
//        import org.springframework.web.bind.annotation.PostMapping;
//        import org.springframework.web.bind.annotation.RequestParam;
//
//
//@Controller
//public class RegistrationController {
//
//    @Autowired
//    private CarService carService;
//
//    @GetMapping("/registration")
//    public String reg(Map<String, Object> model) {
//        model.put("car", new CarDTO());
//        return "Registration";
//    }
//
//    @PostMapping("/home")
//    public String createCar(@ModelAttribute("car") CarDTO empDto) {
//        carService.createOrUpdateCar(empDto);
//        return "redirect:/list";
//    }
//
//    @GetMapping("/list")
//    public String listOfCar(Model model) {
//        List<CarDTO> carList = carService.getAllCar();
//        model.addAttribute("empList", carList);
//        return "carList";
//    }
//
//    @PostMapping("/delete")
//    public String deleteCar(@RequestParam("id") String id) {
//        carService.deleteCar(Long.parseLong(id));
//        return "redirect:/list";
//    }
//
//    @GetMapping("/edit")
//    public String editCar(@RequestParam("id") String id, Map<String, Object> model) {
//        CarDTO empDTO = carService.editCar(Long.parseLong(id));
//        model.put("car", empDTO);
//        return "Registration";
//    }
//
