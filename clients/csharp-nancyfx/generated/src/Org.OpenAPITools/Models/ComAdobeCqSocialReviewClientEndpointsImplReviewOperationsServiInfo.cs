using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo
    /// </summary>
    public sealed class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo:  IEquatable<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo>
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
        public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo()
        {
        }

        private ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo(string Pid, string Title, string Description, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder</returns>
        public static ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder Builder()
        {
            return new ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder</returns>
        public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo left, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo left, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties _Properties;

            internal ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoBuilder Properties(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo</returns>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo(
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