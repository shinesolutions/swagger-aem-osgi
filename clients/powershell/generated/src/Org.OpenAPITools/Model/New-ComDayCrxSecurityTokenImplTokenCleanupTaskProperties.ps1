function New-ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enablePeriodtokenPeriodcleanupPeriodtask},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${batchPeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCrxSecurityTokenImplTokenCleanupTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCrxSecurityTokenImplTokenCleanupTaskProperties -ArgumentList @(
            ${enablePeriodtokenPeriodcleanupPeriodtask},
            ${schedulerPeriodexpression},
            ${batchPeriodsize}
        )
    }
}
