# illness
spread of the disease

V rámci zadania  sme mali navrhnúť dátovú štruktúru pre model šírenia nákazy. Pri návrhu tried sme mali dávať veľký
dôraz na dodržiavanie OOP princípov. Mali sme ich navrhnúť ťak aby sme čo najviac zabránili duplicitnému kódu 
a aby bol návrh pripravený na prípadné rozširovanie funkcionality. Minimálne boli potrebné triedy reprezentujúce nákazu, 
triedy reprezentujúce model šírenia nákazy, herný engine (triedy kontrolujúce priebeh hry), rozhranie s
používateľom, triedy reprezentujúce udalosti v hre (napr. urychlovače/spomalovače šírenia choroby,
nákaza nových ľudí, úmrtie).

Podľa jednoduchého modelu SIR existujú tri skupiny ľudí:
  ● (S)usceptible (vnímaví): skupina ľudí, ktorých môže nakaziť infekčný človek. Títo sa
        potom stanú infekční,
  ● (I)nfectious (infekční): skupina ľudí, ktorí boli infikovaní a teda môžu šíriť nákazu,
  ● (R)ecovered (imúnni): skupina ľudí, ktorí si vytvorili imunitu (sú očkovaný, prekonali nákazu
            a tým pádom sa stali imúnni alebo zomreli) a teda nemôžu byť infikovaný ani infikovať ďalších
          
