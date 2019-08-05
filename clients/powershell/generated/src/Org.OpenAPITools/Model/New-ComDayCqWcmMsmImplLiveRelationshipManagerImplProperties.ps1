function New-ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${liverelationshipmgrPeriodrelationsconfigPerioddefault}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties -ArgumentList @(
            ${liverelationshipmgrPeriodrelationsconfigPerioddefault}
        )
    }
}
