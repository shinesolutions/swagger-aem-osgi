using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo
    /// </summary>
    public sealed class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo:  IEquatable<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo>
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
        public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo()
        {
        }

        private ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo(string Pid, string Title, string Description, ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder</returns>
        public static ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder Builder()
        {
            return new ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder</returns>
        public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo left, ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo left, ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties _Properties;

            internal ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoBuilder Properties(ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo</returns>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo(
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