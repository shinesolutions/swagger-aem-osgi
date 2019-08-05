function New-ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${attachmentTypeBlacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${extensionPeriodorder}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties -ArgumentList @(
            ${attachmentTypeBlacklist},
            ${extensionPeriodorder}
        )
    }
}
