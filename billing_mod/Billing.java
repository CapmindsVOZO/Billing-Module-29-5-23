package com.billing_mod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {

	public WebDriver driver;

	public Billing(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	////////// Insurance claim //////////////////

	@FindBy(xpath = "//a[normalize-space()='Billing']")
	private WebElement ClickBillingModule;

	public WebElement getClickBillingModule() {
		return ClickBillingModule;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement Enterclientname;

	public WebElement getEnterclientname() {
		return Enterclientname;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Saran sad Test'])[1]")
	private WebElement selecli;

	public WebElement getselecli() {
		return selecli;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[2]")
	private WebElement EnterPayername;

	public WebElement getEnterPayername() {
		return EnterPayername;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement SelectUNITEDHEALTHCARE;

	public WebElement getSelectUNITEDHEALTHCARE() {
		return SelectUNITEDHEALTHCARE;
	}

	@FindBy(xpath = "//div[contains(text(),'United National')]")
	private WebElement SelectUNITEDHEALTHCARE1;

	public WebElement getSelectUNITEDHEALTHCARE1() {
		return SelectUNITEDHEALTHCARE1;
	}

	@FindBy(xpath = "//div[contains(@class,'insurance_claim_form_1')]//select[@id='select-btn-hover']")
	private WebElement ClickOfficeDropdown;

	public WebElement getClickOfficeDropdown() {
		return ClickOfficeDropdown;
	}

	@FindBy(xpath = "(//select[@id='select-btn-hover'])[1]")
	private WebElement SelectTestFacilityPhar;

	public WebElement getSelectTestFacilityPhar() {
		return SelectTestFacilityPhar;
	}

	@FindBy(xpath = "(//select[@id='select-btn-hover'])[2]")
	private WebElement ClickByBillingStatus;

	public WebElement getClickByBillingStatus() {
		return ClickByBillingStatus;
	}

	@FindBy(xpath = "//option[@value='Paid In Full']")
	private WebElement SelectPaidInFull;

	public WebElement getSelectPaidInFull() {
		return SelectPaidInFull;
	}

	@FindBy(xpath = "(//select[@id='select-btn-hover'])[3]")
	private WebElement ClickByClaimStatus;

	public WebElement getClickByClaimStatus() {
		return ClickByClaimStatus;
	}

	@FindBy(xpath = "//option[normalize-space()='Claimed']")
	private WebElement selectClaimed;

	public WebElement getselectClaimed() {
		return selectClaimed;
	}

	@FindBy(xpath = "(//input[@id='billing_ins_claim-start-date_end-date-set'])[1]")
	private WebElement clickdate;

	public WebElement getclickdate() {
		return clickdate;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='1'])[1]")
	private WebElement selectStartDate;

	public WebElement getselectStartDate() {
		return selectStartDate;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='30'])[2]")
	private WebElement selectEndDate;

	public WebElement getselectEndDate() {
		return selectEndDate;
	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement ClickSearchButton;

	public WebElement getClickSearchButton() {
		return ClickSearchButton;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
	private WebElement ClickGenerateFormButton;

	public WebElement getClickGenerateFormButton() {
		return ClickGenerateFormButton;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
	private WebElement ClickHCPAPDF;

	public WebElement getClickHCPAPDF() {
		return ClickHCPAPDF;
	}

	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	private WebElement ClickValidateOnly;

	public WebElement getClickValidateOnly() {
		return ClickValidateOnly;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement ClickClose;

	public WebElement getClickClose() {
		return ClickClose;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient payment'])[1]")

	private WebElement patientpayment;

	public WebElement getpatientpayment() {
		return patientpayment;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[1]")

	private WebElement pateintsear1;

	public WebElement getpateintsear1() {
		return pateintsear1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")

	private WebElement pateintpayment1;

	public WebElement getpateintpayment1() {

		return pateintpayment1;
	}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Pay'])[2]")

	private WebElement payaction;

	public WebElement getpayaction() {

		return payaction;
	}
	
	@FindBy(xpath = "(//button[contains(@class,'btn-prmary btn btn-primary')])[1]")   //td[@class='MuiTableCell-root MuiTableCell-body bth MuiTableCell-alignLeft']//button[@type='button']

	private WebElement payaction1;   //(//button[contains(text(),'Pay')])[3],,//td[@class='MuiTableCell-root MuiTableCell-body bth MuiTableCell-alignLeft']//button[@type='button']

	public WebElement getpayaction1() {

		return payaction1;
	}
	
	@FindBy(xpath = "(//input[@id='amountvalue'])[1]")

	private WebElement patientbala;

	public WebElement getpatientbala() {

		return patientbala;
	}
	
	@FindBy(xpath = "(//input[@type='date'])[1]")

	private WebElement datepay;

	public WebElement getdatepay() {

		return datepay;
	}
	
	@FindBy(xpath = "(//select[@id='paymethod'])[1]")

	private WebElement selectcash;

	public WebElement getselectcash() {

		return selectcash;
	}
	
	
	
	
	@FindBy(xpath = "(//button[normalize-space()='Add Payment'])[1]")

	private WebElement addpayment;

	public WebElement getaddpayment() {

		return addpayment;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cancelp;

	public WebElement getcancelp() {

		return cancelp;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement pateintsear2;

	public WebElement getpateintsear2() {
		return pateintsear2;
	}

	@FindBy(xpath = "(//div[@class='content'])[1]")

	private WebElement clipateintsear2;

	public WebElement getclipateintsear2() {
		return clipateintsear2;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'Test')])[2]")

	private WebElement selepatpay;

	public WebElement getselepatpay() {

		return selepatpay;
	}

	///////// patient statemen//////////////////

	@FindBy(xpath = "(//a[normalize-space()='Patient statement'])[1]")

	private WebElement patientstate;

	public WebElement getpatientstate() {
		return patientstate;
	}

	@FindBy(xpath = "(//input[@id='billing_pat_stmt_pat_srch-b'])[1]")

	private WebElement pateintsear3;

	public WebElement getpateintsear3() {
		return pateintsear3;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'Test')])[2]")

	private WebElement clipateintsear3;

	public WebElement getclipateintsear3() {
		return clipateintsear3;
	}

	@FindBy(xpath = "(//input[@id='zerocheck'])[1]")

	private WebElement cliradio;

	public WebElement getcliradio() {
		return cliradio;
	}

	@FindBy(xpath = "(//input[@id='patstafrom_1'])[1]")

	private WebElement stbal;

	public WebElement getstbal() {

		return stbal;
	}

	@FindBy(xpath = "(//input[@id='patstato'])[1]")

	private WebElement enbal;

	public WebElement getenbal() {

		return enbal;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement clisear1;

	public WebElement getclisear1() {

		return clisear1;
	}
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Download'])[1]")

	private WebElement clickdownload;

	public WebElement getclickdownload() {

		return clickdownload;
	}

	@FindBy(xpath = "//div[contains(text(),'All Patients')]")

	private WebElement allpatcl;

	public WebElement getallpatcl() {

		return allpatcl;
	}

	@FindBy(xpath = "(//input[@id='billing_pat_stmt_pat_srch-b'])[2]")

	private WebElement searchpat4;

	public WebElement getsearchpat4() {

		return searchpat4;
	}

	@FindBy(xpath = "(//div[contains(text(),'John peter')])[1]")

	private WebElement selepat2;

	public WebElement getselepat2() {

		return selepat2;
	}

	@FindBy(xpath = "(//input[@id='zerocheck_1'])[1]")

	private WebElement clirad2;

	public WebElement getclirad2() {

		return clirad2;
	}

	@FindBy(xpath = "(//input[@id='patstafrom_1'])[2]")

	private WebElement stabal2;

	public WebElement getstabal2() {

		return stabal2;
	}

	@FindBy(xpath = "(//input[@id='patstato_1'])[1]")

	private WebElement enbal2;

	public WebElement getenbal2() {

		return enbal2;
	}

	@FindBy(xpath = "(//button[@id='billing-pat-all_stmt_srch_btn-b'])[2]")

	private WebElement clisear5;

	public WebElement getclisear5() {

		return clisear5;
	}

	////////////////////// Patient balance /ledger //////////////

	@FindBy(xpath = "//a[contains(text(),'Insurance Claim')]")
	private WebElement clickInsuranceClaim;

	public WebElement getclickInsuranceClaim() {
		return clickInsuranceClaim;
	}

	@FindBy(xpath = "//a[contains(text(),'Patient balance /ledger')]")
	private WebElement ClickPatientBalanceLedger;

	public WebElement getClickPatientBalanceLedger() {
		return ClickPatientBalanceLedger;
	}

	@FindBy(xpath = "(//input[@id='billing_pat_bal-ledger_search-pat'])[1]")
	private WebElement EnterClientName;

	public WebElement getEnterClientName() {
		return EnterClientName;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement SelectJonPeter;

	public WebElement getSelectJonPeter() {
		return SelectJonPeter;
	}

	@FindBy(xpath = "//table/tbody/tr/td[2]")
	private WebElement clickledger;

	public WebElement getclickledger() {
		return clickledger;
	}

	///////////////////// FEES SCHEDULE ////////////////////////////

	@FindBy(xpath = "(//a[normalize-space()='Fee schedule'])[1]")

	private WebElement fees;

	public WebElement getfees() {

		return fees;
	}

	@FindBy(xpath = "(//input[@id='billing_icd9-10_updat_btn'])[1]")

	private WebElement cpthcpcssear;

	public WebElement getcpthcpcssear() {

		return cpthcpcssear;
	}

	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='940612:Test code'])[1]")

	private WebElement clicpt;

	public WebElement getclicpt() {

		return clicpt;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")

	private WebElement insuranam;

	public WebElement getinsuranam() {

		return insuranam;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement insuranamsele;

	public WebElement getinsuranamsele() {

		return insuranamsele;
	}

	@FindBy(xpath = "(//input[@id='billing-fee_schedule-plan_name_text'])[1]")

	private WebElement paynam;

	public WebElement getpaynam() {

		return paynam;
	}

	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='new arvind'])[1]")

	private WebElement paynamsele;

	public WebElement getpaynamsele() {

		return paynamsele;
	}

	@FindBy(xpath = "(//input[@id='billing-fee_schedule-pick_lit-cate-gory'])[1]")

	private WebElement picklis;

	public WebElement getpicklis() {

		return picklis;
	}

	@FindBy(xpath = "//div[contains(text(),'hello')]")

	private WebElement picklissele;

	public WebElement getpicklissele() {

		return picklissele;
	}

	@FindBy(xpath = "(//button[@id='billing-fee_schedule-update-button_id'])[1]")

	private WebElement updacli;

	public WebElement getupdacli() {

		return updacli;
	}

	@FindBy(xpath = "(//button[@id='billing-fee-schd-edit_icon'])[1]")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cliedcancel;

	public WebElement getcliedcancel() {

		return cliedcancel;
	}

	@FindBy(xpath = "(//button[@id='billing-fee_schd-ad_new_btn'])[1]")

	private WebElement cliaddne;

	public WebElement getcliaddne() {

		return cliaddne;
	}

	@FindBy(xpath = "(//select[@id='code_typeval'])[1]")

	private WebElement selecpt;

	public WebElement getselecpt() {

		return selecpt;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement searco;

	public WebElement getsearco() {

		return searco;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='86152--Cell enumeration &id'])[1]") // (//div[@class='title'][normalize-space()='940612
																		// : Test code'])[1]

	private WebElement selecptco;

	public WebElement getselecptco() {

		return selecptco;
	}

	@FindBy(xpath = "(//input[@id='basepval'])[1]")

	private WebElement basepri;

	public WebElement getbasepri() {

		return basepri;
	}

	@FindBy(xpath = "(//input[@id='expremival'])[1]")

	private WebElement expectrei;

	public WebElement getexpectrei() {

		return expectrei;
	}

	@FindBy(xpath = "(//input[@id='cpthpcmode1'])[1]")

	private WebElement cptmod;

	public WebElement getcptmod() {

		return cptmod;
	}

	@FindBy(xpath = "(//select[@id='scoffice'])[1]")

	private WebElement seleoff;

	public WebElement getseleoff() {

		return seleoff;
	}

	@FindBy(xpath = "(//input[@id='NDCCode'])[1]")

	private WebElement Ndcco;

	public WebElement getNdcco() {

		return Ndcco;
	}

	@FindBy(xpath = "(//input[@id='NDCQuantity'])[1]")

	private WebElement Ndcquan;

	public WebElement getNdcquan() {

		return Ndcquan;
	}

	@FindBy(xpath = "(//input[@id='NDCUnits'])[1]")

	private WebElement Ndcun;

	public WebElement getNdcun() {

		return Ndcun;
	}

	@FindBy(xpath = "(//select[@id='payerid'])[1]")

	private WebElement payerid;

	public WebElement getpayerid() {

		return payerid;
	}

	@FindBy(xpath = "(//input[@id='payname'])[1]")

	private WebElement paynam2;

	public WebElement getpaynam2() {

		return paynam2;
	}

	@FindBy(xpath = "(//input[@id='customdesc'])[1]")

	private WebElement cusdes;

	public WebElement getcusdes() {

		return cusdes;
	}

	@FindBy(xpath = "(//input[@id='pickcat'])[1]")

	private WebElement pickca;

	public WebElement getpickca() {

		return pickca;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clisave;

	public WebElement getclisave() {

		return clisave;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement codese2;

	public WebElement getcodese2() {

		return codese2;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement selecusco;

	public WebElement getselecusco() {

		return selecusco;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='A7505--Hmes or trach valve housing'])[1]")

	private WebElement selecodese2;

	public WebElement getselecodese2() {

		return selecodese2;
	}
	//// ICD9

	@FindBy(xpath = "(//div[contains(text(),'ICD-9')])[1]")
	private WebElement clickICD9;

	public WebElement getclickICD9() {
		return clickICD9;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[6]")
	private WebElement EnterICDCode;

	public WebElement getEnterICDCode() {
		return EnterICDCode;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement SelectICDCode;

	public WebElement getSelectICDCode() {
		return SelectICDCode;
	}

	@FindBy(xpath = "(//input[@id='billing_icd9_pick_-lis-cat'])[1]")
	private WebElement EnterPickList;

	public WebElement getEnterPickList() {
		return EnterPickList;
	}

	@FindBy(xpath = "//div[contains(text(),'Yellow')]")
	private WebElement SelectYellow;

	public WebElement getSelectYellow() {
		return SelectYellow;
	}

	@FindBy(xpath = "(//button[@id='billing_icd9-10_updat_btn'])[1]")
	private WebElement ClickUpdate;

	public WebElement getClickUpdate() {
		return ClickUpdate;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]//*[name()='svg']")
	private WebElement ClickEDit;

	public WebElement getClickEDit() {
		return ClickEDit;
	}

	@FindBy(xpath = "//option[normalize-space()='ICD-9']")
	private WebElement selectCodeType;

	public WebElement getselectCodeType1() {
		return selectCodeType;
	}

	@FindBy(xpath = "//input[@id='icd9codescval']")
	private WebElement clearcode;

	public WebElement getclearcode() {
		return clearcode;
	}

	@FindBy(xpath = "//input[@id='icd9codescval']")
	private WebElement Entercode;

	public WebElement getEntercode() {
		return Entercode;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}

	@FindBy(xpath = "(//button[@id='billing_icd9-ad-new'])[1]")
	private WebElement ClickAddNew;

	public WebElement getClickAddNew() {
		return ClickAddNew;
	}

	@FindBy(xpath = "//select[@id='code_typeval']")
	private WebElement ClickCodeType;

	public WebElement getClickCodeType() {
		return ClickCodeType;
	}

	@FindBy(xpath = "(//option[@id='billing-fee-schd-icd9_popup'])[1]")
	private WebElement SelectCodeType;

	public WebElement getSelectCodeType() {
		return SelectCodeType;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement EnterCode;

	public WebElement getEnterCode() {
		return EnterCode;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='278.2-- Hypervitaminosis A'])[1]")
	private WebElement SelectEnterCode;

	public WebElement getSelectEnterCode() {
		return SelectEnterCode;
	}

	@FindBy(xpath = "(//select[@id='scoffice'])[1]")
	private WebElement ClickOffice;

	public WebElement getClickOffice() {
		return ClickOffice;
	}

	@FindBy(xpath = "(//select[@id='scoffice'])[1]")
	private WebElement SelectTestFacilityPhar1;

	public WebElement getSelectTestFacilityPhar1() {

		return SelectTestFacilityPhar;
	}

	@FindBy(xpath = "//input[@id='customdesc']")
	private WebElement EnterDescription;

	public WebElement getEnterDescription() {
		return EnterDescription;
	}

	@FindBy(xpath = "//input[@id='pickcat']")
	private WebElement EnterPicklistCategory;

	public WebElement getEnterPicklistCategory() {
		return EnterPicklistCategory;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement Clicksave;

	public WebElement getClicksave() {
		return Clicksave;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {
		return ClickCancel1;
	}

	/////// ICD 10

	@FindBy(xpath = "(//div[contains(text(),'ICD-10')])[1]")
	private WebElement ClickICD10;

	public WebElement getClickICD10() {
		return ClickICD10;
	}

	@FindBy(xpath = "(//input[@id='billing-fee-sch-icd10-t-box'])[1]")
	private WebElement EnterICD10;

	public WebElement getEnterICD10() {
		return EnterICD10;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement SelectICD10;

	public WebElement getSelectICD10() {
		return SelectICD10;
	}

	@FindBy(xpath = "(//input[@id='billing-icd-10-pic-lis_cat'])[1]")
	private WebElement EnterPickList1;

	public WebElement getEnterPickList1() {
		return EnterPickList1;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement Selectwhite;

	public WebElement getSelectwhite() {
		return Selectwhite;
	}

	@FindBy(xpath = "(//button[@id='billing_icd9-10_updat_btn'])[2]")
	private WebElement SelectUpdate;

	public WebElement getSelectUpdate() {
		return SelectUpdate;
	}

	@FindBy(xpath = "(//tbody[1]/tr[1]/td[4]/button[1])[2]")
	private WebElement ClickEdit;

	public WebElement getClickEdit() {
		return ClickEdit;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement ClickCancel2;

	public WebElement getClickCancel2() {
		return ClickCancel2;
	}

	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add New'])[3]")
	private WebElement ClickaddNew;

	public WebElement getClickaddNew() {
		return ClickaddNew;
	}

	@FindBy(xpath = "//select[@id='code_typeval']")
	private WebElement ClickcodeType;

	public WebElement getClickcodeType() {
		return ClickcodeType;
	}

	@FindBy(xpath = "//option[@value='102']")
	private WebElement SelectycodeType;

	public WebElement getSelectcodeType() {
		return SelectycodeType;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement ClickCode;

	public WebElement getClickCode() {
		return ClickCode;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='E71.111--3-methylglutaconic aciduria'])[1]")
	private WebElement SelectCode;

	public WebElement getSelectCode() {
		return SelectCode;
	}

	@FindBy(xpath = "//select[@id='scoffice']")
	private WebElement Clickoffice;

	public WebElement getClickoffice() {
		return Clickoffice;
	}

	@FindBy(xpath = "//option[@value='4']")
	private WebElement selectTestfacilityphar;

	public WebElement getselectTestfacilityphar() {
		return selectTestfacilityphar;
	}

	@FindBy(xpath = "//input[@id='customdesc']")
	private WebElement EnterCodeDescription;

	public WebElement getEnterCodeDescription() {
		return EnterCodeDescription;
	}

	@FindBy(xpath = "//input[@id='pickcat']")
	private WebElement EnterPicklistcategory;

	public WebElement getEnterPicklistcategory() {
		return EnterPicklistcategory;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement ClickSave;

	public WebElement getClickSave() {
		return ClickSave;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement ClickCance;

	public WebElement getClickCance() {
		return ClickCance;
	}

	/////////////////////// EOB Add Payment ///////////////////

	@FindBy(xpath = "(//a[normalize-space()='EOB'])[1]")

	private WebElement clieob;

	public WebElement getclieob() {

		return clieob;
	}

	@FindBy(xpath = "(//select[@id='EOBInsuranceNameSearch'])[1]")

	private WebElement selein;

	public WebElement getselein() {

		return selein;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

	private WebElement stardat;

	public WebElement getstardat() {

		return stardat;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

	private WebElement endat;

	public WebElement getendat() {

		return endat;
	}

	@FindBy(xpath = "(//button[@id='billing-eob_srch_btn'])[1]")

	private WebElement seareo;

	public WebElement getseareo() {

		return seareo;
	}

	@FindBy(xpath = "(//td[@id='billing_eob-uni-nat_row_col'])[1]")

	private WebElement seleeob;

	public WebElement getseleeob() {

		return seleeob;
	}

	@FindBy(xpath = "(//button[normalize-space()='Edit Payment'])[1]")

	private WebElement seleed;

	public WebElement getseleed() {

		return seleed;
	}
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement saveeob;

	public WebElement getsaveeob() {

		return saveeob;
	}
	@FindBy(xpath = "(//input[@type='text'])[5]")

	private WebElement inspaid;

	public WebElement getinspaid() {

		return inspaid;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement clican;

	public WebElement getclican() {

		return clican;
	}

	@FindBy(xpath = "//a[normalize-space()='EOB']")
	private WebElement ClickEOB;

	public WebElement getClickEOB() {
		return ClickEOB;
	}

	@FindBy(xpath = "//button[normalize-space()='Add Payment']")
	private WebElement ClickAddPyment;

	public WebElement getClickAddPyment() {
		return ClickAddPyment;
	}

	@FindBy(xpath = "(//input[@id='mydate'])[1]")
	private WebElement ClickDate;

	public WebElement getClickDate() {
		return ClickDate;
	}

	@FindBy(xpath = "(//div[normalize-space()='14'])[1]")
	private WebElement SelectDate;

	public WebElement getSelectDate() {
		return SelectDate;
	}

	@FindBy(xpath = "(//select[@id='payerid'])[1]")
	private WebElement ClickPayer;

	public WebElement getClickPayer() {
		return ClickPayer;
	}

	@FindBy(xpath = "//option[@value='2']")
	private WebElement SelectUnitedHealh;

	public WebElement getSelectUnitedHealth() {
		return SelectUnitedHealh;
	}

	@FindBy(xpath = "//select[@id='pay_method']")
	private WebElement SelectPaymentMethod;

	public WebElement getSelectPaymentMethod() {
		return SelectPaymentMethod;
	}

	@FindBy(xpath = "//option[@value='Authorize.net']")
	private WebElement SelectAutorize;

	public WebElement getSelectAutorize() {
		return SelectAutorize;
	}

	@FindBy(xpath = "//div[1]//div[4]//div[1]//div[2]//input[1]")
	private WebElement EnterPaymentNumber;

	public WebElement getEnterPaymentNumber() {
		return EnterPaymentNumber;
	}

	@FindBy(xpath = "(//input[@id='billing-eob-edit-pay_amo_t'])[1]")
	private WebElement EnterAmount;

	public WebElement getEnterAmount() {
		return EnterAmount;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement SelectSave;

	public WebElement getSelectSave() {
		return SelectSave;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement SelectCancel;

	public WebElement getSelectCancel() {
		return SelectCancel;
	}

////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//a[normalize-space()='Card Transactions']")
	private WebElement clickCardTrans;

	public WebElement getclickCardTrans() {
		return clickCardTrans;
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement Entervalue;

	public WebElement getEntervalue() {
		return Entervalue;
	}
	
	@FindBy(xpath = "(//input[@id='billing_pat_bal-ledger_search-pat'])[1]")
	private WebElement searpatient;

	public WebElement getsearpatient() {
		return searpatient;
	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement clickFromdate1;

	public WebElement getclickFromdate1() {
		return clickFromdate1;
	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_to_date'])[1]")
	private WebElement clicktodate1;

	public WebElement getclicktodate1() {
		return clicktodate1;
	}

	@FindBy(xpath = "//select[@placeholder='filter']")
	private WebElement clicksearch1;

	public WebElement getclicksearch1() {
		return clicksearch1;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Details')])[1]")
	private WebElement clickdetails;

	public WebElement getclickdetails() {
		return clicksearch1;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[2]")
	private WebElement clcikclose;

	public WebElement getclcikclose() {
		return clcikclose;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement clicksearch;

	public WebElement getclicksearch() {
		return clicksearch;
	}

	@FindBy(xpath = "//div[@class='app-body']")
	private WebElement clickERA;

	public WebElement getClickERA() {
		return clickERA;
	}

}
