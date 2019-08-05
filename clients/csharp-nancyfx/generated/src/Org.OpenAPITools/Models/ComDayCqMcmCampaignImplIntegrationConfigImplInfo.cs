using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCampaignImplIntegrationConfigImplInfo
    /// </summary>
    public sealed class ComDayCqMcmCampaignImplIntegrationConfigImplInfo:  IEquatable<ComDayCqMcmCampaignImplIntegrationConfigImplInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqMcmCampaignImplIntegrationConfigImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmCampaignImplIntegrationConfigImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCampaignImplIntegrationConfigImplInfo()
        {
        }

        private ComDayCqMcmCampaignImplIntegrationConfigImplInfo(string Pid, string Title, string Description, ComDayCqMcmCampaignImplIntegrationConfigImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCampaignImplIntegrationConfigImplInfo.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder</returns>
        public static ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder Builder()
        {
            return new ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder</returns>
        public ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmCampaignImplIntegrationConfigImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCampaignImplIntegrationConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCampaignImplIntegrationConfigImplInfo left, ComDayCqMcmCampaignImplIntegrationConfigImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCampaignImplIntegrationConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCampaignImplIntegrationConfigImplInfo left, ComDayCqMcmCampaignImplIntegrationConfigImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCampaignImplIntegrationConfigImplInfo.
        /// </summary>
        public sealed class ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmCampaignImplIntegrationConfigImplProperties _Properties;

            internal ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplInfoBuilder Properties(ComDayCqMcmCampaignImplIntegrationConfigImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCampaignImplIntegrationConfigImplInfo.
            /// </summary>
            /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplInfo</returns>
            public ComDayCqMcmCampaignImplIntegrationConfigImplInfo Build()
            {
                Validate();
                return new ComDayCqMcmCampaignImplIntegrationConfigImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}