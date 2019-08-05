function New-ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodauthPeriodrequirements}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationImplPageImpressionsTrackerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationImplPageImpressionsTrackerProperties -ArgumentList @(
            ${slingPeriodauthPeriodrequirements}
        )
    }
}
