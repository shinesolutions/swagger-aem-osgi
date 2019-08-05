function New-ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodinddPeriodpagesPeriodregex},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${idsPeriodjobPerioddecoupled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${idsPeriodjobPeriodworkflowPeriodmodel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamInddProcessINDDMediaExtractProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamInddProcessINDDMediaExtractProcessProperties -ArgumentList @(
            ${processPeriodlabel},
            ${cqPerioddamPeriodinddPeriodpagesPeriodregex},
            ${idsPeriodjobPerioddecoupled},
            ${idsPeriodjobPeriodworkflowPeriodmodel}
        )
    }
}
