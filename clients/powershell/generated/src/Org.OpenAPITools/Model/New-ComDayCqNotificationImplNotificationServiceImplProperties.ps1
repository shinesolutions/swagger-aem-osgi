function New-ComDayCqNotificationImplNotificationServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqNotificationImplNotificationServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqNotificationImplNotificationServiceImplProperties -ArgumentList @(
            ${eventPeriodfilter}
        )
    }
}
