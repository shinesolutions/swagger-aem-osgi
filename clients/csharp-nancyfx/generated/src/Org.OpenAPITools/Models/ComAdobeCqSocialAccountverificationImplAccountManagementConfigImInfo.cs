using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo
    /// </summary>
    public sealed class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo:  IEquatable<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo>
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
        public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo()
        {
        }

        private ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo(string Pid, string Title, string Description, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder</returns>
        public static ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder Builder()
        {
            return new ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder</returns>
        public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo left, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo left, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties _Properties;

            internal ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoBuilder Properties(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo</returns>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo(
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