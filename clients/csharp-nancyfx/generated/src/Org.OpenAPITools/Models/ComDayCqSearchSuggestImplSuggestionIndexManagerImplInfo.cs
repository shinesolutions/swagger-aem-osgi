using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo
    /// </summary>
    public sealed class ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo:  IEquatable<ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo>
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
        public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo()
        {
        }

        private ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo(string Pid, string Title, string Description, ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder</returns>
        public static ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder Builder()
        {
            return new ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder</returns>
        public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo left, ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo left, ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties _Properties;

            internal ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfoBuilder Properties(ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo</returns>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo(
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