package com.fordays.fdpay.bank.cmbc.test;

public class Test {
	public static void main(String[] args) {
		// test1();
		// test2();
		test3();
	}

	public static void test3() {
		String str = "12345abc";
		System.out.println(str.substring(5));
	}

	public static void test2() {
		try {
			String str = "123你好";
			System.out.println(str);
			byte[] byteArray1 = str.getBytes();
			byte[] byteArray2 = str.getBytes("GBK");
			byte[] byteArray3 = str.getBytes("utf-8");
			System.out.println("byte1Length--" + byteArray1.length
					+ "--byte2Length--" + byteArray2.length + "--byte3Length--"
					+ byteArray3.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test1() {
		String myCer = "MIIDqjCCAxOgAwIBAgIEP+vHoDANBgkqhkiG9w0BAQUFADApMQswCQYDVQQGEwJDTjEaMBgGA1UEChMRQ0ZDQSBPcGVyYXRpb24gQ0EwHhcNMDYxMjI3MDY1MzQyWhcNMDgxMjI3MDcyMzQyWjBmMQswCQYDVQQGEwJDTjEaMBgGA1UEChMRQ0ZDQSBPcGVyYXRpb24gQ0ExDTALBgNVBAsTBENNQkMxEjAQBgNVBAsTCUN1c3RvbWVyczEYMBYGA1UEAxQPOTJjbWJjQDAwMDAwMDAxMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDZfvEjA4u56u0aKfhIYwm6xsrZBKsRhiikE2YoiQ9XqUkAmPNKBgE9NvN5BPEVXEHRMweXtYRLBLdCmPP/nkJ7cCFKuVMPsvRWk4RHOrDspAzPQqhbM66IEDam1a+I2lR8B6kmMveBu5IMqvG+bsMS3oHAPR32Wm4FuvieKIp3eQIDAQABo4IBoDCCAZwwCwYDVR0PBAQDAgXgMCsGA1UdEAQkMCKADzIwMDYxMjI3MDY1MzQyWoEPMjAwODEyMjcwNzIzNDJaMBEGCWCGSAGG+EIBAQQEAwIFoDApBglghkgBhvhCAQIEHBYaaHR0cHM6Ly9TSVRFX05BTUUvY2RhLWNnaS8wSwYJYIZIAYb4QgEDBD4WPGNsaWVudGNnaS5leGU/YWN0aW9uPWNoZWNrUmV2b2NhdGlvbiYmQ1JMPWNuPUNSTDE3ODgmc2VyaWFsPTAfBgNVHREEGDAWgRR3YW5ndGluZ0BjbWJjLmNvbS5jbjBOBgNVHR8ERzBFMEOgQaA/pD0wOzELMAkGA1UEBhMCQ04xGjAYBgNVBAoTEUNGQ0EgT3BlcmF0aW9uIENBMRAwDgYDVQQDEwdDUkwxNzg4MB8GA1UdIwQYMBaAFMMnxjZoyCdlJIevkadLJjMC5RrpMB0GA1UdDgQWBBRElMUdhslGUAzD2INiYSm0UAbIPzAJBgNVHRMEAjAAMBkGCSqGSIb2fQdBAAQMMAobBFY2LjADAgOoMA0GCSqGSIb3DQEBBQUAA4GBAHtlC5eatxZAsHZcmz2kHPxT9pim4cMyOXB+aVGbxrejUly9bUXDPwrAk2qxLtPfbh+ndnwPsxP/+SNtfIok0NbO+LzM2npqA0G2WbyLnjtuFQINMtof+7G4LUvpEXQpJ0WHZO8manwSQv/Tm3AWxUwH8khn12MZk3a/xz7QVHgv"
				.trim();
		String ieCer = "MIIDqjCCAxOgAwIBAgIEP+vHoDANBgkqhkiG9w0BAQUFADApMQswCQYDVQQGEwJDTjEaMBgGA1UEChMRQ0ZDQSBPcGVyYXRpb24gQ0EwHhcNMDYxMjI3MDY1MzQyWhcNMDgxMjI3MDcyMzQyWjBmMQswCQYDVQQGEwJDTjEaMBgGA1UEChMRQ0ZDQSBPcGVyYXRpb24gQ0ExDTALBgNVBAsTBENNQkMxEjAQBgNVBAsTCUN1c3RvbWVyczEYMBYGA1UEAxQPOTJjbWJjQDAwMDAwMDAxMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDZfvEjA4u56u0aKfhIYwm6xsrZBKsRhiikE2YoiQ9XqUkAmPNKBgE9NvN5BPEVXEHRMweXtYRLBLdCmPP/nkJ7cCFKuVMPsvRWk4RHOrDspAzPQqhbM66IEDam1a+I2lR8B6kmMveBu5IMqvG+bsMS3oHAPR32Wm4FuvieKIp3eQIDAQABo4IBoDCCAZwwCwYDVR0PBAQDAgXgMCsGA1UdEAQkMCKADzIwMDYxMjI3MDY1MzQyWoEPMjAwODEyMjcwNzIzNDJaMBEGCWCGSAGG+EIBAQQEAwIFoDApBglghkgBhvhCAQIEHBYaaHR0cHM6Ly9TSVRFX05BTUUvY2RhLWNnaS8wSwYJYIZIAYb4QgEDBD4WPGNsaWVudGNnaS5leGU/YWN0aW9uPWNoZWNrUmV2b2NhdGlvbiYmQ1JMPWNuPUNSTDE3ODgmc2VyaWFsPTAfBgNVHREEGDAWgRR3YW5ndGluZ0BjbWJjLmNvbS5jbjBOBgNVHR8ERzBFMEOgQaA/pD0wOzELMAkGA1UEBhMCQ04xGjAYBgNVBAoTEUNGQ0EgT3BlcmF0aW9uIENBMRAwDgYDVQQDEwdDUkwxNzg4MB8GA1UdIwQYMBaAFMMnxjZoyCdlJIevkadLJjMC5RrpMB0GA1UdDgQWBBRElMUdhslGUAzD2INiYSm0UAbIPzAJBgNVHRMEAjAAMBkGCSqGSIb2fQdBAAQMMAobBFY2LjADAgOoMA0GCSqGSIb3DQEBBQUAA4GBAHtlC5eatxZAsHZcmz2kHPxT9pim4cMyOXB+aVGbxrejUly9bUXDPwrAk2qxLtPfbh+ndnwPsxP/+SNtfIok0NbO+LzM2npqA0G2WbyLnjtuFQINMtof+7G4LUvpEXQpJ0WHZO8manwSQv/Tm3AWxUwH8khn12MZk3a/xz7QVHgv"
				.trim();
		System.out.println(myCer.equals(ieCer));
	}
}
