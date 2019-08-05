using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplNotificationsRouterInfo
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplNotificationsRouterInfo:  IEquatable<ComAdobeCqSocialNotificationsImplNotificationsRouterInfo>
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
        public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplNotificationsRouterInfo()
        {
        }

        private ComAdobeCqSocialNotificationsImplNotificationsRouterInfo(string Pid, string Title, string Description, ComAdobeCqSocialNotificationsImplNotificationsRouterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder</returns>
        public ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialNotificationsImplNotificationsRouterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo left, ComAdobeCqSocialNotificationsImplNotificationsRouterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplNotificationsRouterInfo left, ComAdobeCqSocialNotificationsImplNotificationsRouterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialNotificationsImplNotificationsRouterProperties _Properties;

            internal ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterInfoBuilder Properties(ComAdobeCqSocialNotificationsImplNotificationsRouterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplNotificationsRouterInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterInfo</returns>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplNotificationsRouterInfo(
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