@test
Feature: DressUp
  @test1
  Scenario: მთავარ გვერდზე დაკლიკება
    Given User land on page "www.dressup.ge"
    Then Title should be "Dressup.ge - ონლაინ მაღაზია | ტანსაცმელი, ფეხსაცმელი, აქსესუარები | საერთაშორისო ბრენდები | უფასო მიტანა"
    When User accepts popup


