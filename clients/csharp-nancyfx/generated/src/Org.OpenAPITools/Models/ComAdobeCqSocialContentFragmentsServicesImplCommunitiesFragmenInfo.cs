using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo:  IEquatable<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo>
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
        public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo()
        {
        }

        private ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo(string Pid, string Title, string Description, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder</returns>
        public static ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder</returns>
        public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo left, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo left, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties _Properties;

            internal ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoBuilder Properties(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo</returns>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo(
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