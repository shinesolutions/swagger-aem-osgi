function New-ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${MaxRetry},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${attachmentTypeBlacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties -ArgumentList @(
            ${MaxRetry},
            ${fieldWhitelist},
            ${attachmentTypeBlacklist}
        )
    }
}
