using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo:  IEquatable<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo>
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
        public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo()
        {
        }

        private ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder</returns>
        public static ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder</returns>
        public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo left, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo left, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties _Properties;

            internal ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoBuilder Properties(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo</returns>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo(
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