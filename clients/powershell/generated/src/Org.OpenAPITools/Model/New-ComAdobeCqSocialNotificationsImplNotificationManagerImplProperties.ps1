function New-ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodunreadPeriodnotificationPeriodcount}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties -ArgumentList @(
            ${maxPeriodunreadPeriodnotificationPeriodcount}
        )
    }
}
