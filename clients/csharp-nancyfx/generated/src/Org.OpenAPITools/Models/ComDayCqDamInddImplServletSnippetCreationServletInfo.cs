using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddImplServletSnippetCreationServletInfo
    /// </summary>
    public sealed class ComDayCqDamInddImplServletSnippetCreationServletInfo:  IEquatable<ComDayCqDamInddImplServletSnippetCreationServletInfo>
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
        public ComDayCqDamInddImplServletSnippetCreationServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddImplServletSnippetCreationServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddImplServletSnippetCreationServletInfo()
        {
        }

        private ComDayCqDamInddImplServletSnippetCreationServletInfo(string Pid, string Title, string Description, ComDayCqDamInddImplServletSnippetCreationServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddImplServletSnippetCreationServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder</returns>
        public static ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder Builder()
        {
            return new ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder</returns>
        public ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamInddImplServletSnippetCreationServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddImplServletSnippetCreationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplServletSnippetCreationServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddImplServletSnippetCreationServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddImplServletSnippetCreationServletInfo left, ComDayCqDamInddImplServletSnippetCreationServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddImplServletSnippetCreationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplServletSnippetCreationServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddImplServletSnippetCreationServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddImplServletSnippetCreationServletInfo left, ComDayCqDamInddImplServletSnippetCreationServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddImplServletSnippetCreationServletInfo.
        /// </summary>
        public sealed class ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamInddImplServletSnippetCreationServletProperties _Properties;

            internal ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplServletSnippetCreationServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplServletSnippetCreationServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplServletSnippetCreationServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplServletSnippetCreationServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamInddImplServletSnippetCreationServletInfoBuilder Properties(ComDayCqDamInddImplServletSnippetCreationServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddImplServletSnippetCreationServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamInddImplServletSnippetCreationServletInfo</returns>
            public ComDayCqDamInddImplServletSnippetCreationServletInfo Build()
            {
                Validate();
                return new ComDayCqDamInddImplServletSnippetCreationServletInfo(
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