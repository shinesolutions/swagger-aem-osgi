using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplDiffChangesObserverInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplDiffChangesObserverInfo:  IEquatable<ComAdobeCqSocialSyncImplDiffChangesObserverInfo>
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
        public ComAdobeCqSocialSyncImplDiffChangesObserverProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplDiffChangesObserverInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplDiffChangesObserverInfo()
        {
        }

        private ComAdobeCqSocialSyncImplDiffChangesObserverInfo(string Pid, string Title, string Description, ComAdobeCqSocialSyncImplDiffChangesObserverProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplDiffChangesObserverInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder</returns>
        public static ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder</returns>
        public ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSyncImplDiffChangesObserverInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplDiffChangesObserverInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplDiffChangesObserverInfo left, ComAdobeCqSocialSyncImplDiffChangesObserverInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplDiffChangesObserverInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplDiffChangesObserverInfo left, ComAdobeCqSocialSyncImplDiffChangesObserverInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplDiffChangesObserverInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSyncImplDiffChangesObserverProperties _Properties;

            internal ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverInfoBuilder Properties(ComAdobeCqSocialSyncImplDiffChangesObserverProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplDiffChangesObserverInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverInfo</returns>
            public ComAdobeCqSocialSyncImplDiffChangesObserverInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplDiffChangesObserverInfo(
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