function New-ComDayCqReportingImplConfigServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${repconfPeriodtimezone},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${repconfPeriodlocale},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${repconfPeriodsnapshots},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${repconfPeriodrepdir},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${repconfPeriodhourofday},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${repconfPeriodminofhour},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${repconfPeriodmaxrows},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${repconfPeriodfakedata},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${repconfPeriodsnapshotuser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${repconfPeriodenforcesnapshotuser}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReportingImplConfigServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReportingImplConfigServiceImplProperties -ArgumentList @(
            ${repconfPeriodtimezone},
            ${repconfPeriodlocale},
            ${repconfPeriodsnapshots},
            ${repconfPeriodrepdir},
            ${repconfPeriodhourofday},
            ${repconfPeriodminofhour},
            ${repconfPeriodmaxrows},
            ${repconfPeriodfakedata},
            ${repconfPeriodsnapshotuser},
            ${repconfPeriodenforcesnapshotuser}
        )
    }
}
