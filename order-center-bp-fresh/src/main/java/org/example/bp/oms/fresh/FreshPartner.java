package org.example.bp.oms.fresh;

import io.github.dddplus.annotation.Partner;
import io.github.dddplus.ext.IIdentityResolver;
import org.example.cp.oms.spec.model.IOrderModel;

@Partner(code = FreshPartner.CODE, name = "生鲜业务前台BP")
public class FreshPartner implements IIdentityResolver<IOrderModel> {
    public static final String CODE = "fresh";

    @Override
    public boolean match(IOrderModel model) {
        return model.getSource().toLowerCase().equals(CODE);
    }
}
