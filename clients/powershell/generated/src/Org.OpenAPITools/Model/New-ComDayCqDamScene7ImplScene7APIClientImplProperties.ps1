function New-ComDayCqDamScene7ImplScene7APIClientImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7APIClientImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7APIClientImplProperties -ArgumentList @(
            ${cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname},
            ${cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname}
        )
    }
}
