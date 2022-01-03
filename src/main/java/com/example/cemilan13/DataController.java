/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cemilan13;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hp
 */
@Controller
public class DataController {
    @RequestMapping("/aldy")
    //@ResponseBody
    public String proses(HttpServletRequest data,Model mode)
    {
        proses ps = new proses();
        String sayur = data.getParameter("Sayur");
        String perkilo = data.getParameter("kilo");
        Integer hargakilo = Integer.valueOf(perkilo);
        String jmlbeli = data.getParameter("beli");
        Integer jumlah = Integer.valueOf(jmlbeli);
        String customer = data.getParameter("costom");
        Integer jmluang = Integer.valueOf(customer);
        Integer jmlbyr = hargakilo * jumlah;
        
        ps.prss(jmlbyr);
        Integer diskon = ps.jumlahdiskon;
        Integer totaldiskon = ps.totaldiskon;
        Integer totalbayar = ps.hargadibayar;
        String kembalian = ps.back(jmluang);
        
        mode.addAttribute("sayur", sayur);
        mode.addAttribute("hargakilo", "Rp "+perkilo);
        mode.addAttribute("jmlbeli", jmlbeli);
        mode.addAttribute("costomer", "Rp "+customer);
        mode.addAttribute("hargaawal", "Rp "+jmlbyr);
        mode.addAttribute("diskon", diskon+"%");
        mode.addAttribute("totaldk", "Rp "+totaldiskon);
        mode.addAttribute("total", "Rp "+totalbayar);
        mode.addAttribute("kembali", kembalian);
        
        return "hasil";
    }
}
