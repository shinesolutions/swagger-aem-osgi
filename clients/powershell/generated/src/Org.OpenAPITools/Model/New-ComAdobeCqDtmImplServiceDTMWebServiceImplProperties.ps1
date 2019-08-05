function New-ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${socketPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDtmImplServiceDTMWebServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDtmImplServiceDTMWebServiceImplProperties -ArgumentList @(
            ${connectionPeriodtimeout},
            ${socketPeriodtimeout}
        )
    }
}
