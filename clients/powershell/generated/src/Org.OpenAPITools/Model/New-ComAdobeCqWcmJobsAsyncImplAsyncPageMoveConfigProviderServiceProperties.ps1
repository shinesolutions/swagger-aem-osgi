function New-ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${threshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jobTopicName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${emailEnabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties -ArgumentList @(
            ${threshold},
            ${jobTopicName},
            ${emailEnabled}
        )
    }
}
