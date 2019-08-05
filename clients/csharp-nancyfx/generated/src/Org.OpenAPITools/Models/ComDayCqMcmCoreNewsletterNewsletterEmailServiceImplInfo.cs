using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo
    /// </summary>
    public sealed class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo:  IEquatable<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo>
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
        public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo()
        {
        }

        private ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo(string Pid, string Title, string Description, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder</returns>
        public static ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder Builder()
        {
            return new ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder</returns>
        public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo left, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo left, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties _Properties;

            internal ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoBuilder Properties(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo</returns>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo(
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