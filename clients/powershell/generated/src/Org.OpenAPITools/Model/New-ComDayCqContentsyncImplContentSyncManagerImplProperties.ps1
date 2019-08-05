function New-ComDayCqContentsyncImplContentSyncManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${contentsyncPeriodfallbackPeriodauthorizable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${contentsyncPeriodfallbackPeriodupdateuser}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqContentsyncImplContentSyncManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqContentsyncImplContentSyncManagerImplProperties -ArgumentList @(
            ${contentsyncPeriodfallbackPeriodauthorizable},
            ${contentsyncPeriodfallbackPeriodupdateuser}
        )
    }
}
