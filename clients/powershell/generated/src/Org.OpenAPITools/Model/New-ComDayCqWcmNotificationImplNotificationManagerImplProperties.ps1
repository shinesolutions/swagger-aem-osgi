function New-ComDayCqWcmNotificationImplNotificationManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${eventPeriodtopics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmNotificationImplNotificationManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmNotificationImplNotificationManagerImplProperties -ArgumentList @(
            ${eventPeriodtopics}
        )
    }
}
