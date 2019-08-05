function New-ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodtopics},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties -ArgumentList @(
            ${eventPeriodtopics},
            ${eventPeriodfilter}
        )
    }
}
