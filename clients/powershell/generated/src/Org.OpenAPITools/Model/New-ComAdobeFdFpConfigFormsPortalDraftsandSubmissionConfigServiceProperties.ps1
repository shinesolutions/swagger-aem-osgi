function New-ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${portalPeriodoutboxes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${draftPerioddataPeriodservice},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${draftPeriodmetadataPeriodservice},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${submitPerioddataPeriodservice},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${submitPeriodmetadataPeriodservice},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pendingSignPerioddataPeriodservice},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pendingSignPeriodmetadataPeriodservice}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties -ArgumentList @(
            ${portalPeriodoutboxes},
            ${draftPerioddataPeriodservice},
            ${draftPeriodmetadataPeriodservice},
            ${submitPerioddataPeriodservice},
            ${submitPeriodmetadataPeriodservice},
            ${pendingSignPerioddataPeriodservice},
            ${pendingSignPeriodmetadataPeriodservice}
        )
    }
}
