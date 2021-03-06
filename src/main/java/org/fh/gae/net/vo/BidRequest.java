package org.fh.gae.net.vo;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.fh.gae.query.vo.AdSlot;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BidRequest {
    private String requestId;

    private Auth auth;

    private Device device;

    private List<AdSlot> slots;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
