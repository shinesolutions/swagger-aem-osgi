using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo
    /// </summary>
    public sealed class ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo:  IEquatable<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo>
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
        public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo()
        {
        }

        private ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo(string Pid, string Title, string Description, ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder</returns>
        public static ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder Builder()
        {
            return new ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder</returns>
        public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo left, ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo left, ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties _Properties;

            internal ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoBuilder Properties(ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo</returns>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo(
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