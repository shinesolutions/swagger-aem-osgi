function New-ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${extensionPeriodorder},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${flushPeriodforumontopic}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties -ArgumentList @(
            ${extensionPeriodorder},
            ${flushPeriodforumontopic}
        )
    }
}
