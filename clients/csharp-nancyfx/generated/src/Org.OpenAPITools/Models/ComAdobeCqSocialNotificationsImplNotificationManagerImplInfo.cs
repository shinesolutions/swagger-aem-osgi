using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo:  IEquatable<ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo>
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
        public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo()
        {
        }

        private ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder</returns>
        public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo left, ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo left, ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties _Properties;

            internal ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfoBuilder Properties(ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo</returns>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo(
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