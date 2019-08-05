using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo
    /// </summary>
    public sealed class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo:  IEquatable<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo>
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
        public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo()
        {
        }

        private ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo(string Pid, string Title, string Description, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder</returns>
        public static ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder Builder()
        {
            return new ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder</returns>
        public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo left, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo left, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.
        /// </summary>
        public sealed class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties _Properties;

            internal ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoBuilder Properties(ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo</returns>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo Build()
            {
                Validate();
                return new ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo(
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