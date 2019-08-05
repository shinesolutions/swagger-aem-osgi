function New-ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jobPeriodtopics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties -ArgumentList @(
            ${jobPeriodtopics}
        )
    }
}
