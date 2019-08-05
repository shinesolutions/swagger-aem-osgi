using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo>
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
        public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo(string Pid, string Title, string Description, ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties _Properties;

            internal ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoBuilder Properties(ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo(
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