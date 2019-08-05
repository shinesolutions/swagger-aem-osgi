function New-OrgApacheSlingEngineImplSlingMainServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slingPeriodmaxPeriodcalls},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slingPeriodmaxPeriodinclusions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${slingPeriodtracePeriodallow},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slingPeriodmaxPeriodrecordPeriodrequests},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodstorePeriodpatternPeriodrequests},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodserverinfo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodadditionalPeriodresponsePeriodheaders}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineImplSlingMainServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineImplSlingMainServletProperties -ArgumentList @(
            ${slingPeriodmaxPeriodcalls},
            ${slingPeriodmaxPeriodinclusions},
            ${slingPeriodtracePeriodallow},
            ${slingPeriodmaxPeriodrecordPeriodrequests},
            ${slingPeriodstorePeriodpatternPeriodrequests},
            ${slingPeriodserverinfo},
            ${slingPeriodadditionalPeriodresponsePeriodheaders}
        )
    }
}
