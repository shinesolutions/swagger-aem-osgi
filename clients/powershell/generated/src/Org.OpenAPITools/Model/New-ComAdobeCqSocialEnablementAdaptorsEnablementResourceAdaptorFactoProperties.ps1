function New-ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${isMemberCheck}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties -ArgumentList @(
            ${isMemberCheck}
        )
    }
}
