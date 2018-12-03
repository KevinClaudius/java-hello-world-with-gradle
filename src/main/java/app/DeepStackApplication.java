package app;

import static java.lang.Math.tan;
import static java.lang.Math.atan;

public class DeepStackApplication {
  public static void main(String[] args) {
    double a = 23742932.23389;
    int c = 10000;
    while (true) {
      double d = doWork(a);
	    if (c == 0) {
	      System.out.println(d);
	      c = 10000;
	    }
	    c--;
    }
  }

  private static double doWork(double x) {
    return f0(x);
  }

  // Simulate a deep call stack, because linux "perf" tool tends
  // to truncate the stack at 127.  We can also use this to simulate
  // method inlining and options to remove that.
  private static double f0(double x) {
    return f1(x);
  }

  private static double f1(double x) {
    return f2(x);
  }

  private static double f2(double x) {
    return f3(x);
  }

  private static double f3(double x) {
    return f4(x);
  }

  private static double f4(double x) {
    return f5(x);
  }

  private static double f5(double x) {
    return f6(x);
  }

  private static double f6(double x) {
    return f7(x);
  }

  private static double f7(double x) {
    return f8(x);
  }

  private static double f8(double x) {
    return f9(x);
  }

  private static double f9(double x) {
    return f10(x);
  }

  private static double f10(double x) {
    return f11(x);
  }

  private static double f11(double x) {
    return f12(x);
  }

  private static double f12(double x) {
    return f13(x);
  }

  private static double f13(double x) {
    return f14(x);
  }

  private static double f14(double x) {
    return f15(x);
  }

  private static double f15(double x) {
    return f16(x);
  }

  private static double f16(double x) {
    return f17(x);
  }

  private static double f17(double x) {
    return f18(x);
  }

  private static double f18(double x) {
    return f19(x);
  }

  private static double f19(double x) {
    return f20(x);
  }

  private static double f20(double x) {
    return f21(x);
  }

  private static double f21(double x) {
    return f22(x);
  }

  private static double f22(double x) {
    return f23(x);
  }

  private static double f23(double x) {
    return f24(x);
  }

  private static double f24(double x) {
    return f25(x);
  }

  private static double f25(double x) {
    return f26(x);
  }

  private static double f26(double x) {
    return f27(x);
  }

  private static double f27(double x) {
    return f28(x);
  }

  private static double f28(double x) {
    return f29(x);
  }

  private static double f29(double x) {
    return f30(x);
  }

  private static double f30(double x) {
    return f31(x);
  }

  private static double f31(double x) {
    return f32(x);
  }

  private static double f32(double x) {
    return f33(x);
  }

  private static double f33(double x) {
    return f34(x);
  }

  private static double f34(double x) {
    return f35(x);
  }

  private static double f35(double x) {
    return f36(x);
  }

  private static double f36(double x) {
    return f37(x);
  }

  private static double f37(double x) {
    return f38(x);
  }

  private static double f38(double x) {
    return f39(x);
  }

  private static double f39(double x) {
    return f40(x);
  }

  private static double f40(double x) {
    return f41(x);
  }

  private static double f41(double x) {
    return f42(x);
  }

  private static double f42(double x) {
    return f43(x);
  }

  private static double f43(double x) {
    return f44(x);
  }

  private static double f44(double x) {
    return f45(x);
  }

  private static double f45(double x) {
    return f46(x);
  }

  private static double f46(double x) {
    return f47(x);
  }

  private static double f47(double x) {
    return f48(x);
  }

  private static double f48(double x) {
    return f49(x);
  }

  private static double f49(double x) {
    return f50(x);
  }

  private static double f50(double x) {
    return f51(x);
  }

  private static double f51(double x) {
    return f52(x);
  }

  private static double f52(double x) {
    return f53(x);
  }

  private static double f53(double x) {
    return f54(x);
  }

  private static double f54(double x) {
    return f55(x);
  }

  private static double f55(double x) {
    return f56(x);
  }

  private static double f56(double x) {
    return f57(x);
  }

  private static double f57(double x) {
    return f58(x);
  }

  private static double f58(double x) {
    return f59(x);
  }

  private static double f59(double x) {
    return f60(x);
  }

  private static double f60(double x) {
    return f61(x);
  }

  private static double f61(double x) {
    return f62(x);
  }

  private static double f62(double x) {
    return f63(x);
  }

  private static double f63(double x) {
    return f64(x);
  }

  private static double f64(double x) {
    return f65(x);
  }

  private static double f65(double x) {
    return f66(x);
  }

  private static double f66(double x) {
    return f67(x);
  }

  private static double f67(double x) {
    return f68(x);
  }

  private static double f68(double x) {
    return f69(x);
  }

  private static double f69(double x) {
    return f70(x);
  }

  private static double f70(double x) {
    return f71(x);
  }

  private static double f71(double x) {
    return f72(x);
  }

  private static double f72(double x) {
    return f73(x);
  }

  private static double f73(double x) {
    return f74(x);
  }

  private static double f74(double x) {
    return f75(x);
  }

  private static double f75(double x) {
    return f76(x);
  }

  private static double f76(double x) {
    return f77(x);
  }

  private static double f77(double x) {
    return f78(x);
  }

  private static double f78(double x) {
    return f79(x);
  }

  private static double f79(double x) {
    return f80(x);
  }

  private static double f80(double x) {
    return f81(x);
  }

  private static double f81(double x) {
    return f82(x);
  }

  private static double f82(double x) {
    return f83(x);
  }

  private static double f83(double x) {
    return f84(x);
  }

  private static double f84(double x) {
    return f85(x);
  }

  private static double f85(double x) {
    return f86(x);
  }

  private static double f86(double x) {
    return f87(x);
  }

  private static double f87(double x) {
    return f88(x);
  }

  private static double f88(double x) {
    return f89(x);
  }

  private static double f89(double x) {
    return f90(x);
  }

  private static double f90(double x) {
    return f91(x);
  }

  private static double f91(double x) {
    return f92(x);
  }

  private static double f92(double x) {
    return f93(x);
  }

  private static double f93(double x) {
    return f94(x);
  }

  private static double f94(double x) {
    return f95(x);
  }

  private static double f95(double x) {
    return f96(x);
  }

  private static double f96(double x) {
    return f97(x);
  }

  private static double f97(double x) {
    return f98(x);
  }

  private static double f98(double x) {
    return f99(x);
  }

  private static double f99(double x) {
    return f100(x);
  }

  private static double f100(double x) {
    return f101(x);
  }

  private static double f101(double x) {
    return f102(x);
  }

  private static double f102(double x) {
    return f103(x);
  }

  private static double f103(double x) {
    return f104(x);
  }

  private static double f104(double x) {
    return f105(x);
  }

  private static double f105(double x) {
    return f106(x);
  }

  private static double f106(double x) {
    return f107(x);
  }

  private static double f107(double x) {
    return f108(x);
  }

  private static double f108(double x) {
    return f109(x);
  }

  private static double f109(double x) {
    return f110(x);
  }

  private static double f110(double x) {
    return f111(x);
  }

  private static double f111(double x) {
    return f112(x);
  }

  private static double f112(double x) {
    return f113(x);
  }

  private static double f113(double x) {
    return f114(x);
  }

  private static double f114(double x) {
    return f115(x);
  }

  private static double f115(double x) {
    return f116(x);
  }

  private static double f116(double x) {
    return f117(x);
  }

  private static double f117(double x) {
    return f118(x);
  }

  private static double f118(double x) {
    return f119(x);
  }

  private static double f119(double x) {
    return f120(x);
  }

  private static double f120(double x) {
    return f121(x);
  }

  private static double f121(double x) {
    return f122(x);
  }

  private static double f122(double x) {
    return f123(x);
  }

  private static double f123(double x) {
    return f124(x);
  }

  private static double f124(double x) {
    return f125(x);
  }

  private static double f125(double x) {
    return f126(x);
  }

  private static double f126(double x) {
    return f127(x);
  }

  private static double f127(double x) {
    return f128(x);
  }

  private static double f128(double x) {
    return f129(x);
  }

  private static double f129(double x) {
    return f130(x);
  }

  private static double f130(double x) {
    return f131(x);
  }

  private static double f131(double x) {
    return f132(x);
  }

  private static double f132(double x) {
    return f133(x);
  }

  private static double f133(double x) {
    return f134(x);
  }

  private static double f134(double x) {
    return f135(x);
  }

  private static double f135(double x) {
    return f136(x);
  }

  private static double f136(double x) {
    return f137(x);
  }

  private static double f137(double x) {
    return f138(x);
  }

  private static double f138(double x) {
    return f139(x);
  }

  private static double f139(double x) {
    return f140(x);
  }

  private static double f140(double x) {
    return f141(x);
  }

  private static double f141(double x) {
    return f142(x);
  }

  private static double f142(double x) {
    return f143(x);
  }

  private static double f143(double x) {
    return f144(x);
  }

  private static double f144(double x) {
    return f145(x);
  }

  private static double f145(double x) {
    return f146(x);
  }

  private static double f146(double x) {
    return f147(x);
  }

  private static double f147(double x) {
    return f148(x);
  }

  private static double f148(double x) {
    return f149(x);
  }

  private static double f149(double x) {
    return f150(x);
  }

  private static double f150(double x) {
    return f151(x);
  }

  private static double f151(double x) {
    return f152(x);
  }

  private static double f152(double x) {
    return f153(x);
  }

  private static double f153(double x) {
    return f154(x);
  }

  private static double f154(double x) {
    return f155(x);
  }

  private static double f155(double x) {
    return f156(x);
  }

  private static double f156(double x) {
    return f157(x);
  }

  private static double f157(double x) {
    return f158(x);
  }

  private static double f158(double x) {
    return f159(x);
  }

  private static double f159(double x) {
    return f160(x);
  }

  private static double f160(double x) {
    return f161(x);
  }

  private static double f161(double x) {
    return f162(x);
  }

  private static double f162(double x) {
    return f163(x);
  }

  private static double f163(double x) {
    return f164(x);
  }

  private static double f164(double x) {
    return f165(x);
  }

  private static double f165(double x) {
    return f166(x);
  }

  private static double f166(double x) {
    return f167(x);
  }

  private static double f167(double x) {
    return f168(x);
  }

  private static double f168(double x) {
    return f169(x);
  }

  private static double f169(double x) {
    return f170(x);
  }

  private static double f170(double x) {
    return f171(x);
  }

  private static double f171(double x) {
    return f172(x);
  }

  private static double f172(double x) {
    return f173(x);
  }

  private static double f173(double x) {
    return f174(x);
  }

  private static double f174(double x) {
    return f175(x);
  }

  private static double f175(double x) {
    return f176(x);
  }

  private static double f176(double x) {
    return f177(x);
  }

  private static double f177(double x) {
    return f178(x);
  }

  private static double f178(double x) {
    return f179(x);
  }

  private static double f179(double x) {
    return f180(x);
  }

  private static double f180(double x) {
    return f181(x);
  }

  private static double f181(double x) {
    return f182(x);
  }

  private static double f182(double x) {
    return f183(x);
  }

  private static double f183(double x) {
    return f184(x);
  }

  private static double f184(double x) {
    return f185(x);
  }

  private static double f185(double x) {
    return f186(x);
  }

  private static double f186(double x) {
    return f187(x);
  }

  private static double f187(double x) {
    return f188(x);
  }

  private static double f188(double x) {
    return f189(x);
  }

  private static double f189(double x) {
    return f190(x);
  }

  private static double f190(double x) {
    return f191(x);
  }

  private static double f191(double x) {
    return f192(x);
  }

  private static double f192(double x) {
    return f193(x);
  }

  private static double f193(double x) {
    return f194(x);
  }

  private static double f194(double x) {
    return f195(x);
  }

  private static double f195(double x) {
    return f196(x);
  }

  private static double f196(double x) {
    return f197(x);
  }

  private static double f197(double x) {
    return f198(x);
  }

  private static double f198(double x) {
    return f199(x);
  }

  private static double f199(double x) {
    return f200(x);
  }

  private static double f200(double x) {
    return f201(x);
  }

  private static double f201(double x) {
    return f202(x);
  }

  private static double f202(double x) {
    return f203(x);
  }

  private static double f203(double x) {
    return f204(x);
  }

  private static double f204(double x) {
    return f205(x);
  }

  private static double f205(double x) {
    return f206(x);
  }

  private static double f206(double x) {
    return f207(x);
  }

  private static double f207(double x) {
    return f208(x);
  }

  private static double f208(double x) {
    return f209(x);
  }

  private static double f209(double x) {
    return f210(x);
  }

  private static double f210(double x) {
    return f211(x);
  }

  private static double f211(double x) {
    return f212(x);
  }

  private static double f212(double x) {
    return f213(x);
  }

  private static double f213(double x) {
    return f214(x);
  }

  private static double f214(double x) {
    return f215(x);
  }

  private static double f215(double x) {
    return f216(x);
  }

  private static double f216(double x) {
    return f217(x);
  }

  private static double f217(double x) {
    return f218(x);
  }

  private static double f218(double x) {
    return f219(x);
  }

  private static double f219(double x) {
    return f220(x);
  }

  private static double f220(double x) {
    return f221(x);
  }

  private static double f221(double x) {
    return f222(x);
  }

  private static double f222(double x) {
    return f223(x);
  }

  private static double f223(double x) {
    return f224(x);
  }

  private static double f224(double x) {
    return f225(x);
  }

  private static double f225(double x) {
    return f226(x);
  }

  private static double f226(double x) {
    return f227(x);
  }

  private static double f227(double x) {
    return f228(x);
  }

  private static double f228(double x) {
    return f229(x);
  }

  private static double f229(double x) {
    return f230(x);
  }

  private static double f230(double x) {
    return f231(x);
  }

  private static double f231(double x) {
    return f232(x);
  }

  private static double f232(double x) {
    return f233(x);
  }

  private static double f233(double x) {
    return f234(x);
  }

  private static double f234(double x) {
    return f235(x);
  }

  private static double f235(double x) {
    return f236(x);
  }

  private static double f236(double x) {
    return f237(x);
  }

  private static double f237(double x) {
    return f238(x);
  }

  private static double f238(double x) {
    return f239(x);
  }

  private static double f239(double x) {
    return f240(x);
  }

  private static double f240(double x) {
    return f241(x);
  }

  private static double f241(double x) {
    return f242(x);
  }

  private static double f242(double x) {
    return f243(x);
  }

  private static double f243(double x) {
    return f244(x);
  }

  private static double f244(double x) {
    return f245(x);
  }

  private static double f245(double x) {
    return f246(x);
  }

  private static double f246(double x) {
    return f247(x);
  }

  private static double f247(double x) {
    return f248(x);
  }

  private static double f248(double x) {
    return f249(x);
  }

  private static double f249(double x) {
    return tan(atan(tan(atan(tan(atan(tan(atan(x))))))));
  }
}
