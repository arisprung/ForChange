package forchange.com.forchange;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by arisprung on 12/14/16.
 */

public class TermsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms);
        TextView textView = (TextView)findViewById(R.id.terms_text);
        String s = "<body><p>Welcome to Pure DNA Test!</p>\n" +
                "<p>These terms and conditions outline the rules and regulations for the use of Pure DNA Test’s Website and Pure DNA app.</p>\n" +
                "<p>These Terms and Conditions (“Terms”) govern your use of the website at <u><a href=\"http://purednatest.com\" rel=\"nofollow\" target=\"_blank\">http://purednatest.com</a></u> (the “Website”<i>)</i> and Pure DNA’s services which are available via the Website and Pure DNA’s mobile application (the “Service”). </p>\n" +
                "<p>Your use of the Service signifies your understanding and agreement to be bound by these Terms and to comply with the applicable law, rules and regulations. Do not continue to use Pure DNA Test’s Website or Services if you do not accept all of the terms and conditions stated on this page. You may not accept these Terms if you are under the age of 13, if you are not qualified to create a&nbsp;binding&nbsp;legal agreement, or if the use of the Service is prohibited by the laws applicable to you.</p>\n" +
                "<p>The following terminology applies to these Terms, Privacy Statement and Disclaimer Notice and any or all Agreements: “Client”, “You” and “Your” refers to you, the person accessing the Service and accepting the Company’s terms and conditions. “The Company”, “Ourselves”, “We”, “Our” and “Us”, refers to our Company. “Party”, “Parties”, refers to both the Client and ourselves, or either the Client or ourselves. Any use of the above terminology or other words in the singular, plural, capitalization and/or he/she or they, are taken as interchangeable and therefore as referring to same.</p>\n" +
                "<p>Cookies</p>\n" +
                "<p>We employ the use of cookies. By using&nbsp;<u>Pure DNA Test</u>’s Service you consent to the use of cookies in accordance with <u>Pure DNA Test</u>’s privacy policy.</p>\n" +
                "<p>Most of the modern day interactive web sites use cookies to enable us to retrieve user details for each visit. We receive data from the computer, mobile phone or other device used to access the Service. This may include IP address, the type of browser, system and language, date and time of visits, the type of internet service, location (including GPS location when made available to us), the pages visited, and the way of interaction with ads and other types of content. Cookies are used in some areas of our Website to enable the functionality of this area and ease of use for those people visiting. Some of our affiliate / advertising partners may also use cookies. </p>\n" +
                "<p>License</p>\n" +
                "<p>Unless otherwise stated, <u>Pure DNA Test</u> and/or its licensors own the intellectual property rights for all material on the Service. All intellectual property rights are reserved. You may view and/or print pages from&nbsp;the Website&nbsp;for your own personal use subject to restrictions set in these Terms. All photos, texts, scripts, designs, graphics, logos, interactive features, trademarks, service marks, trade names and other content used, displayed, included, incorporated, uploaded, posted or published as part of the Services, are the sole property of Pure DNA Test, subject to copyright and other intellectual property rights under applicable laws, and you may not use, download, distribute and/or copy them, in whole or in part, other than for printouts from the Website for personal use as stated above.</p>\n" +
                "<p>You must not:</p>\n" +
                "<ul><li>Republish material from&nbsp;<a href=\"http://purednatest.com\" rel=\"nofollow\" target=\"_blank\">http://purednatest.com</a></li></ul>\n" +
                "<li>Sell, rent or sub-license material from&nbsp;<a href=\"http://purednatest.com\" rel=\"nofollow\" target=\"_blank\">http://purednatest.com</a></li>\n" +
                "<li>Reproduce, duplicate or copy material from&nbsp;<a href=\"http://purednatest.com\" rel=\"nofollow\" target=\"_blank\">http://purednatest.com</a></li>\n" +
                "<li>Redistribute content from Pure DNA Test (unless the content is specifically made for redistribution).</li>\n" +
                "<p>User Comments</p>\n" +
                "<ol><li>Certain parts of the Website or the Service may offer the opportunity for users to post and exchange opinions, information, material and data (“Comments”). Pure DNA Test does not screen, edit, publish or review Comments prior to their appearance on the Website or Service and Comments do not reflect the views or opinions of Pure DNA Test, its agents or affiliates. Comments reflect the view and opinion of the person who posts such view or opinion. To the extent permitted by applicable laws Pure DNA Test shall not be responsible or liable for the Comments or for any loss cost, liability, damages or expenses caused and or suffered as a result of any use of and/or posting of and/or appearance of the Comments on this website.</li>\n" +
                "<li>Pure DNA Test reserves the right to monitor all Comments and to remove any Comments which it considers in its absolute discretion to be inappropriate, offensive or otherwise in breach of these Terms and Conditions.</li>\n" +
                "<li>You warrant and represent that:</li>\n" +
                "<li>You are entitled to post the Comments website and have all necessary licenses and consents to do so;</li>\n" +
                "<li>The Comments do not infringe any intellectual property right, including without limitation copyright, patent or trademark, or other proprietary right of any third party;</li>\n" +
                "<li>The Comments do not contain any defamatory, libelous, offensive, indecent or otherwise unlawful material or material which is an invasion of privacy;</li>\n" +
                "<li>The Comments will not be used to solicit or promote business or custom or present commercial activities or unlawful activity.</li>\n" +
                "<ol><li>You hereby grant to&nbsp;<b>Pure DNA Test</b>&nbsp;a non-exclusive royalty-free license to use, reproduce, edit and authorize others to use, reproduce and edit any of your Comments in any and all forms, formats or media.</li></ol>\n" +
                "<p>Hyperlinking to our Content</p>\n" +
                "<li>The following organizations may link to our Website without prior written approval:</li>\n" +
                "<li>Government agencies;</li>\n" +
                "<li>Search engines;</li>\n" +
                "<li>News organizations;</li>\n" +
                "<li>Online directory distributors when they list us in the directory may link to our Website in the same manner as they hyperlink to the websites of other listed businesses; and</li>\n" +
                "<li>Systemwide Accredited Businesses except soliciting non-profit organizations, charity shopping malls, and charity fundraising groups which may not hyperlink to our Website.</li>\n" +
                "<ol><li>These organizations may link to our home page, to publications or to other Website information so long as the link: (a) does not falsely imply sponsorship, endorsement or approval of the linking party and its products or services; and (b) fits within the context of the linking party's site.</li>\n" +
                "<li>Other requests to link to our content or Website will be approved or declined at Pure DNA Test’s sole discretion. </li>\n" +
                "<li>If you are interested in linking to our Website, you must notify us by sending an e-mail to&nbsp;<u><a href=\"mailto:AngelaCanon@gmail.com\" target=\"_blank\">AngelaCanon@gmail.com</a></u>. Please include your name, your organization name, contact information (such as a phone number and/or e-mail address) as well as the URL of your site, a list of any URLs from which you intend to link to our Web site, and a list of the URL(s) on our site to which you would like to link. Allow 2-3 weeks for a response.</li>\n" +
                "<li>Approved organizations may hyperlink to our Web site as follows:</li>\n" +
                "<li>By use of our corporate name; or</li>\n" +
                "<li>By use of the uniform resource locator (Web address) being linked to; or</li>\n" +
                "<li>By use of any other description of our Web site or material being linked to that makes sense within the context and format of content on the linking party's site.</li>\n" +
                "<p>No use of Pure DNA Test’s logo or other artwork will be allowed for linking absent a trademark license agreement.</p>\n" +
                "<p>Iframes</p>\n" +
                "<p>Without prior approval and express written permission, you may not create frames around our web pages or use other techniques that alter in any way the visual presentation or appearance of our Website.</p>\n" +
                "<p>Content Liability</p>\n" +
                "<p>Pure DNA Test waives any responsibility or liability for any content appearing on the Website or provided by the Service. You agree to indemnify and defend us against all claims arising out of or based upon the Website, Service or from linking to the Website. Pure DNA Test’s Service is solely for entertainment purposes and Pure DNA disclaims any warranty of scientific merit or accuracy of the Service it provides.</p>\n" +
                "<p>Reservation of Rights</p>\n" +
                "<p>We reserve the right at any time and in our sole discretion to request that you remove all links or any particular link to our Website. You agree to immediately remove all links to our Website upon such request. We also reserve the right to amend these Terms and any linking policy at any time. By continuing to link to our Website, you agree to be bound to and abide by these linking terms and conditions. Pure DNA Test further reserves the right to immediately discontinue the Service at any time for any reason without prior notice.</p>\n" +
                "<p>Removal of Links from our Website</p>\n" +
                "<p>If you find any link on our Website or any linked web site objectionable for any reason, you may contact us about this. We will consider requests to remove links but will have no obligation to do so or to respond directly to you.</p>\n" +
                "<p>We do not warrant the completeness or accuracy of the information on the Website or the Service; nor do we commit to ensuring that the Website or Services remain available or that the material on the Website is kept up to date.</p>\n" +
                "<p>Limitation of Liability</p>\n" +
                "<p>YOU EXPRESSLY AGREE THAT YOUR USE OF THE SERVICE AND WEBSITE IS AT YOUR OWN RISK. THE SERVICE IS PROVIDED ON AN \"AS IS\" AND \"AS AVAILABLE\" BASIS. TO THE FULLEST EXTENT PERMITTED BY APPLICABLE LAW, WE EXPRESSLY DISCLAIM ALL WARRANTIES OF ANY KIND, WHETHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT AS TO THE OPERATION OF THE SERVICE, OR THE INFORMATION, CONTENT, MATERIALS, OR PRODUCTS INCLUDED IN THE SERVICE. WE MAKE NO WARRANTY THAT THE SERVICE WILL MEET YOUR REQUIREMENTS, OR THAT THE SERVICE WILL BE UNINTERRUPTED, TIMELY, SECURE, OR ERROR FREE, THAT DEFECTS WILL BE CORRECTED, OR THAT THE SITE OR THE SERVER THAT MAKES IT AVAILABLE ARE FREE OF VIRUSES, OR THAT ANY INFORMATION OR ADVICE OBTAINED BY YOU AS A RESULT OF YOUR USE OF THE SERVICE WILL BE ACCURATE OR RELIABLE. NO ADVICE OR INFORMATION, WHETHER ORAL OR WRITTEN, OBTAINED BY YOU THROUGH OR FROM THE SERVICE SHALL CREATE ANY WARRANTY OR IMPOSE ANY LIABILITY. YOU WILL BE SOLELY RESPONSIBLE FOR ANY DAMAGE TO YOUR COMPUTER SYSTEM, MOBILE DEVICE OR ELECTRONIC DEVICE OR LOSS OF DATA, OR ANY OTHER LOSS OR DAMAGE THAT RESULTS FROM YOUR USE OF THE SERVICE. SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OF CERTAIN WARRANTIES, THEREFORE SOME OF THE ABOVE EXCLUSIONS MAY NOT APPLY TO YOU. TO THE EXTENT PERMITTED BY LAW, WE EXCLUDE ALL WARRANTIES. </p>\n" +
                "<p>UNDER NO CIRCUMSTANCES, INCLUDING, BUT NOT LIMITED TO, NEGLIGENCE, SHALL PURE DNA TEST AND ITS AFFILIATES, OFFICERS, AGENTS, MEMBERS AND EMPLOYEES BE LIABLE FOR ANY INDIRECT, DIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES RESULTING FROM THE USE OR THE INABILITY TO USE THE SERVICE, INCLUDING, BUT NOT LIMITED TO, DAMAGES FOR LOSS OF PROFITS, USE, DATA OR OTHER INTANGIBLES, EVEN IF PURE DNA TEST HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES AND EVEN IF SUCH DAMAGES WERE FORESEEABLE. YOU SPECIFICALLY AGREE THAT WE ARE NOT RESPONSIBLE OR LIABLE TO YOU OR ANYONE ELSE FOR ANY UNLAWFUL, EXPLICIT OR OTHERWISE OBJECTIONABLE CONDUCT OF ANY OTHER PARTY ON OR THROUGH THE SERVICE, OR FOR ANY INFRINGEMENT OR VIOLATION OF YOUR RIGHTS BY ANY OTHER PARTY, INCLUDING, BUT NOT LIMITED TO, INTELLECTUAL PROPERTY RIGHTS, RIGHTS OF PUBLICITY, OR RIGHTS OF PRIVACY. SOME JURISDICTIONS DO NOT ALLOW THE LIMITATION OR EXCLUSION OF LIABILITY FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES, IN SUCH JURISDICTIONS OUR LIABILITY IS LIMITED TO THE FULLEST EXTENT PERMITTED BY LAW.</p>\n" +
                "<p>Miscellaneous </p>\n" +
                "<p>These Terms and its performance shall be governed by the laws of the State of Israel, without regard to conflict of laws provisions that would result in the application of the laws of any other jurisdiction. The parties hereto submit the exclusive jurisdiction to the courts of Tel-Aviv-Jaffa.</p>\n" +
                "<p>These Terms and policy linked herein constitute the entire agreement between you and Pure DNA Test with respect to your use of the Service, and supersede all prior or contemporaneous understandings regarding such subject matter.</p>\n" +
                "<p>Pure DNA Test may assign at any time any of its rights and/or obligations hereunder to any third party without User’s consent.</p>\n" +
                "\n" +
                "<p>Credit &amp; Contact Information</p>\n" +
                "<p>This Terms and conditions page was created at&nbsp;<u><a href=\"http://termsandconditionstemplate.com\" target=\"_blank\">termsandconditionstemplate.<wbr>com</a></u>&nbsp;generator. If you have any queries regarding any of our terms, please contact us.</p></ol></ol></body>";
        textView.setText(Html.fromHtml(s));
    }
}
