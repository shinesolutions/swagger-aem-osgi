function New-ComDayCqWcmNotificationEmailImplEmailChannelProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodfrom}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmNotificationEmailImplEmailChannelProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmNotificationEmailImplEmailChannelProperties -ArgumentList @(
            ${emailPeriodfrom}
        )
    }
}
