using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSrpImplSocialSolrConnectorInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSrpImplSocialSolrConnectorInfo:  IEquatable<ComAdobeCqSocialSrpImplSocialSolrConnectorInfo>
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
        public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSrpImplSocialSolrConnectorInfo()
        {
        }

        private ComAdobeCqSocialSrpImplSocialSolrConnectorInfo(string Pid, string Title, string Description, ComAdobeCqSocialSrpImplSocialSolrConnectorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder</returns>
        public static ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder</returns>
        public ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSrpImplSocialSolrConnectorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo left, ComAdobeCqSocialSrpImplSocialSolrConnectorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSrpImplSocialSolrConnectorInfo left, ComAdobeCqSocialSrpImplSocialSolrConnectorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSrpImplSocialSolrConnectorProperties _Properties;

            internal ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorInfoBuilder Properties(ComAdobeCqSocialSrpImplSocialSolrConnectorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorInfo</returns>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSrpImplSocialSolrConnectorInfo(
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